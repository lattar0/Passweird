import { Dimensions, StyleSheet } from 'react-native';
import { theme } from '../../styles/themes';

export const styles = StyleSheet.create({
  header: {
    paddingTop: Dimensions.get('window').width * 0.20,
    flex: 1,
    backgroundColor: 'transparent',
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center',
  },

  textHeader: {
    fontSize: 45,
    color: theme.colors.white,
    fontFamily: theme.fonts.semiBold,
    marginBottom: 32,
  }
});