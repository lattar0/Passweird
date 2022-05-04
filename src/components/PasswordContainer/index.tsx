import React from 'react';
import { Pressable, Text, View } from 'react-native';
import { FontAwesome5 } from '@expo/vector-icons';
import { styles } from './styles';
import { theme } from '../../styles/themes';

export type PasswordContainerProps = {
  name: string;
  icon: string;
}

type Props = {
  data: PasswordContainerProps;

}

export function PasswordContainer({ data }: Props) {
  return (
    
    <Pressable style={styles.container}>
      <FontAwesome5
        name={data.icon}
        size={28}
        color={theme.colors.gray}
        style={styles.icon}
      />
      <View style={styles.divider} />
      <Text style={styles.text}>{data.name}</Text>
    </Pressable>
  )
}